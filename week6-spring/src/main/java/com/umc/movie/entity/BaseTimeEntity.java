package com.umc.movie.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

// 테이블이 되지는 않고, 상속하는 엔티티에 created_at, updated_at 컬럼을 물려줘요.
@Getter
@MappedSuperclass
public abstract class BaseTimeEntity {

    // INSERT 시점에 한 번만 채워지고 이후에는 바뀌지 않아요.
    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    // 저장될 때마다 현재 시각으로 다시 채워져요.
    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;
}
