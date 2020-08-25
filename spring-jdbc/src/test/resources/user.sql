create table jdbcuser
(
    id   int auto_increment
        primary key,
    name varchar(255) null comment '姓名',
    age  int          null comment '年齡',
    sex  varchar(255) null comment '性別'
);
