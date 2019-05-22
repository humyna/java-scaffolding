-- ----------------------------
--  Table structure for USER_INFO_DEMO
-- ----------------------------
DROP TABLE USER_INFO_DEMO;

CREATE TABLE USER_INFO_DEMO (
	ID NUMBER NOT NULL PRIMARY key,
	USER_NAME VARCHAR2 (60),
	AGE NUMBER ,
	GENDER VARCHAR2 (1),
	BIRTH_DAY DATE,
	COMMENTS VARCHAR2 (64)
);

COMMENT ON COLUMN USER_INFO_DEMO.ID IS '主键id';
COMMENT ON COLUMN USER_INFO_DEMO.USER_NAME IS '姓名';
COMMENT ON COLUMN USER_INFO_DEMO.AGE IS '年龄';
COMMENT ON COLUMN USER_INFO_DEMO.GENDER IS '性别 0 女 1 男 2 保密 ';
COMMENT ON COLUMN USER_INFO_DEMO.BIRTH_DAY IS '出生日期';

COMMENT ON COLUMN USER_INFO_DEMO.COMMENTS IS '备注';

--sequence
create sequence seq_USER_INFO_DEMO
minvalue 1
maxvalue 2147483647
start with 1
increment by 1
cache 1000;