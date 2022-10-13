package com.line.domain;

import java.util.Arrays;
import java.util.List;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private int emergencyRoom;  // Java는 camel, Python은 snake
    private String name;
    private String subdivision;


    public Hospital(String id, String address, String category, int emergencyRoom, String name) {
        this.id = id;
        this.address = address;
        this.category = category;
        this.emergencyRoom = emergencyRoom;
        this.name = name;
        this.setDistrict();
        this.setSubdivision();
    }


    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }


    public String getDistrict() {
//        String[] splitted = this.address.split(" ");
//        return String.format("%s %s", splitted[0], splitted[1]);
        return district;
    }
    public void setDistrict() {
        String[] splitted = this.address.split(" ");
        this.district = String.format("%s %s", splitted[0], splitted[1]);
    }

    public String getCategory() {
        return category;
    }

    public int getEmergencyRoom() {
        return emergencyRoom;
    }

    public String getName() {
        return name;
    }

    public String getSubdivision() {
        return subdivision;
    }

    private void setSubdivision() {
        String[] subdivisionList = {"내과", "치과", "피부과", "성형외과", "외과", "소아과", "가정의학과", "의원"};
        String subdivision = this.name;
        for (String division:subdivisionList) {
            if(subdivision.contains(division)) {
                subdivision = division;
                break;
            }
        }
        this.subdivision = subdivision;
    }

    public String getSqlInsertQuery() {
        String sql = String.format("INSERT INTO `test-db`.`seoul_hospital`\n" +
                "(`id`,`address`,`district`,`category`,`emergency_room`,`name`,`subdivision`)\n"+
                "VALUES\n" +
                "(\"%s\",\n" +
                "\"%s\",\n" +
                "\"%s\",\n" +
                "\"%s\",\n" +
                "%d,\n" +
                "\"%s\",\n" +
                "\"%s\");", this.id, this.address, this.district, this.category, this.emergencyRoom, this.name, this.subdivision);
        return sql;
    }
}
