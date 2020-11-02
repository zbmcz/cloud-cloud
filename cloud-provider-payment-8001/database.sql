-- 交易流水表
CREATE TABLE payment (
    'id' bigint(20) NOT NULL AUTO_INCREMENT COMMIT 'ID',
    'serial' varchar(200) DEFAULT '',
    PRIMARY KEY ('id')
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8