package com.gproject.enums;

public enum UserTypeEnum {
    //系统管理员admin
    SYSTEM_ADMIN(1),

    //系统的学生用户
    SYSTEM_STU(3),

    //系统的教师用户
    SYSTEM_TEA(2);


    private int typeCode;

    UserTypeEnum(int typeCode) {
        this.typeCode = typeCode;
    }

    public int getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(int typeCode) {
        this.typeCode = typeCode;
    }
}
