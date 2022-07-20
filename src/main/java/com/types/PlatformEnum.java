package com.types;

import com.model.PropertyValue;

public enum PlatformEnum {

    BRAZIL("BR1", "platform.url.br1", "America", "region.url.america"),
    EUN("EUN1", "platform.url.euw1", "EU", "region.url.eu"),
    EUW("EUW1", "platform.url.eun1", "EU", "region.url.eu"),
    JP1("JP1", "platform.url.jp1", "Asia", "region.url.asia"),
    KR("KR", "platform.url.kr1", "Asia", "region.url.asia"),
    LA1("LA1", "platform.url.la1", "America", "region.url.america"),
    LA2("LA2", "platform.url.la2", "America", "region.url.america"),
    NA1("NA1", "platform.url.na1", "America", "region.url.america"),
    OC1("OC1", "platform.url.oc1", "Asia", "region.url.asia"),
    RU("RU","platform.url.ru", "EU", "region.url.eu"),
    SEA("SEA", "", "SEA", "region.url.sea"),
    TR1("TR1", "platform.url.tr", "Asia", "region.url.asia");


    private final String name;
    private final String host;
    private final String regionCode;
    private final String regionHost;

    private PlatformEnum(String name, String host, String regionCode, String regionHost){
        this.name=name;
        this.host=host;
        this.regionCode=regionCode;
        this.regionHost=regionHost;
    }

    public boolean isInList(String value){
        for(PlatformEnum reg: PlatformEnum.values()){
            if(reg.name().equals(value)){
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getHost() {
        return host;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public String getRegionHost() {
        return regionHost;
    }

    public static String getHostByName(String name){
        PropertyValue pv = new PropertyValue();
        for(PlatformEnum reg: PlatformEnum.values()){
            if(reg.getName().equals(name)){
                return (reg.getHost());
            }
        }
        return null;
    }

    public static String getRegionHostByRegionCode(String code){
        PropertyValue pv = new PropertyValue();
        for(PlatformEnum reg: PlatformEnum.values()){
            if(reg.getRegionCode().equals(code)){
                return (reg.getRegionHost());
            }
        }
        return null;
    }

    public static String getRegionCodeByName(String name){
        PropertyValue pv = new PropertyValue();
        for(PlatformEnum reg: PlatformEnum.values()){
            if(reg.getName().equals(name)){
                return (reg.getRegionCode());
            }
        }
        return null;
    }

    public static boolean isInEnumByName(String name){
        PropertyValue pv = new PropertyValue();
        for(PlatformEnum reg: PlatformEnum.values()){
            if(reg.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    public static boolean isInEnumByRegionCode(String regionCode){
        PropertyValue pv = new PropertyValue();
        for(PlatformEnum reg: PlatformEnum.values()){
            if(reg.getRegionCode().equals(regionCode)){
                return true;
            }
        }
        return false;
    }
}
