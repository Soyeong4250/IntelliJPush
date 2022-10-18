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
        String[] subdivisionList = {"소아", "피부", "성형", "정형외과", "척추", "교정", "산부인과", "관절", "봉합", "화상", "골절", "영유아", "안과", "가정의학과", "비뇨기과", "치과", "한방", "요양", "보건", "내과", "외과", "병원", "의원", };
        String subdivision = this.name;
        for (String division:subdivisionList) {
            if(subdivision.contains("노인")) {
                subdivision = "요양";
                break;
            }else if(subdivision.contains("조산")) {
                subdivision = "산부인과";
                break;
            }else if(subdivision.contains(division)) {
                subdivision = division;
                break;
            }
        }
        this.subdivision = subdivision;
    }

    /*public String getSqlInsertQuery() {
        String sql = String.format("INSERT IGNORE INTO `test-db`.`seoul_hospital`\n" +
                "(`id`,`address`,`district`,`category`,`emergency_room`,`name`,`subdivision`)\n"+
                "VALUES\n" +
                "(\"%s\",\n" +
                "\"%s\",\n" +
                "\"%s\",\n" +
                "\"%s\",\n" +
                "%d,\n" +
                "\"%s\",\n" +
                "\"%s\")", this.id, this.address, this.district, this.category, this.emergencyRoom, this.name, this.subdivision);
        return sql;
    }

    public String getTupleString() {
        String tuple = String.format("\n(\"%s\",\n" +
                        "\"%s\",\n" +
                        "\"%s\",\n" +
                        "\"%s\",\n" +
                        "%d,\n" +
                        "\"%s\",\n" +
                        "\"%s\")", this.id, this.address, this.district, this.category, this.emergencyRoom, this.name, this.subdivision);

        return tuple;
    }*/

    @Override
    public String toString() {
        return "Hospital{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", district='" + district + '\'' +
                ", category='" + category + '\'' +
                ", emergencyRoom=" + emergencyRoom +
                ", name='" + name + '\'' +
                ", subdivision='" + subdivision + '\'' +
                '}';
    }
}
