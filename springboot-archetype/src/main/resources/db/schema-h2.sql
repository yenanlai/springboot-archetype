DROP TABLE IF EXISTS user;

CREATE TABLE user (
  id          BIGINT(20) NOT NULL
  COMMENT '无业务含义',
  name        VARCHAR(255) DEFAULT NULL
  COMMENT '姓名',
  create_id   VARCHAR(255) DEFAULT NULL
  COMMENT '创建人',
  create_time DATETIME     DEFAULT NULL
  COMMENT '创建时间',
  update_id   VARCHAR(255) DEFAULT NULL
  COMMENT '更新人',
  update_time DATETIME     DEFAULT NULL
  COMMENT '更新时间',
  PRIMARY KEY (id)
);


