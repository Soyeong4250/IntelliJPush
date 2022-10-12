use `test-db`;

CREATE TABLE `test-db`.`seoul_hospital` (
  `id` VARCHAR(8) NOT NULL,
  `address` VARCHAR(90) NOT NULL COMMENT '전체 주소',
  `district` VARCHAR(15) NOT NULL COMMENT '서울시 oo구',
  `category` VARCHAR(1) NOT NULL COMMENT '병원분류\nC 의원\nE 한방병원\nN 치과의원\n.. 추후 추가 작성',
  `emergency_room` INT NOT NULL COMMENT '응급실 운영여부\n1 운영\n2 운영안함',
  `name` VARCHAR(40) NOT NULL COMMENT '기관명',
  `subdivision` VARCHAR(10) NULL DEFAULT NULL COMMENT '세부 분과\n피부과, 성형외과, 외과, 내과, 소아과, 가정의학과, 치과 등',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

INSERT INTO `test-db`.`seoul_hospital`
(`id`,
`address`,
`district`,
`category`,
`emergency_room`,
`name`,
`subdivision`)
VALUES
('A1120837',
'서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)',
'서울특별시 금천구',
'C',
2,
'가산기대찬의원',
null);

INSERT INTO `test-db`.`seoul_hospital`
(`id`,
`address`,
`district`,
`category`,
`emergency_room`,
`name`,
`subdivision`)
VALUES
('A1104130',
'서울특별시 강남구 도산대로 118 (논현동 신사빌딩 2층)',
'서울특별시 강남구',
'C',
2,
'365엠씨의원',
null);

SELECT * FROM `seoul_hospital`;
