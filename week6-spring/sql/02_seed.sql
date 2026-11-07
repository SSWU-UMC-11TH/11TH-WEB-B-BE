-- 02_seed.sql
-- 중복 체크와 유저별 평점 조회를 확인하기 위한 더미 데이터
-- password는 bcrypt(6주차)를 배우기 전까지 더미 문자열만 넣어요.

USE umc_movie;

INSERT INTO member (email, password, nickname) VALUES
('noco@umc.com', '$2a$10$dummyEncodedPasswordValue', '수현'),
('minseo@umc.com', '$2a$10$dummyEncodedPasswordValue', '민서');

-- movie_id: 550(파이트 클럽), 155(다크 나이트)
INSERT INTO rating (member_id, movie_id, score, comment) VALUES
(1, 550, 5, '최고의 영화!'),
(1, 155, 4, '다시 봐도 명작'),
(2, 550, 3, '호불호가 갈릴 것 같아요');
