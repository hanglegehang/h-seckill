alter table h_goods
  add `is_used` int(4) DEFAULT '0' COMMENT '是否可用  0：不可用  1：可用',
  add `is_deleted` int(4) DEFAULT '0' COMMENT '是否删除 0：正常 1：已删除',
  add `gmt_create` datetime DEFAULT CURRENT_TIMESTAMP,
  add `gmt_update` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP;