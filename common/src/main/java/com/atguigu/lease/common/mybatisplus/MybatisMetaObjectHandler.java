package com.atguigu.lease.common.mybatisplus;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

@Component
@Slf4j
public class MybatisMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("公共字段自动填充[INSERT]...");
        log.info(metaObject.toString());
        metaObject.setValue("createTime", new Date());
        metaObject.setValue("updateTime", new Date());
//        this.strictInsertFill(metaObject, "createTime", Date.class, new Date());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("公共字段自动填充[UPDATE]...");
        log.info(metaObject.toString());
        metaObject.setValue("updateTime", new Date());
//        this.strictUpdateFill(metaObject, "updateTime", Date.class, new Date());
    }
}
