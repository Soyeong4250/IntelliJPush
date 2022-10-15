package com.line.domain;

import java.util.Arrays;
import java.util.List;

// 5. Hospital 객체 생성 (멤버변수, 생성자(처음에는 모든 멤버변수를 매개변수에 넣어서 생성), getter) 👉 다시 HospitalParse 이동
public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private int emergencyRoom;  // Java는 camel, Python은 snake
    private String name;
    private String subdivision;


    // 8. HospitalParser에서 넘겨준 데이터에 맞게 매개변수 수정하고 setter 이용하여 데이터 저장하기
    // 👉 Main 클래스로 이동하자
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
        String[] subdivisionList = {"소아", "피부", "성형", "정형외과", "척추", "교정", "산부인과", "관절", "봉합", "화상", "골절", "영유아", "안과", "가정의학과", "비뇨기과", "치과", "한방", "요양", "의료시설", "보건", "내과", "외과", "병원", "의원"};
        String subdivision = this.name;
        for (String division:subdivisionList) {
            if(subdivision.contains("노인")) {
                subdivision = "요양";
                break;
            }else if(subdivision.contains("재단") || subdivision.contains("센터")) {
                subdivision = "의료시설";
                break;
            }else if(subdivision.contains("조산")) {
                subdivision = "산부인과";
            }else if(subdivision.contains(division)) {
                subdivision = division;
                break;
            }
        }
        this.subdivision = subdivision;
    }

    // 11. SQL문 생성 코드를 작성
    public String getSqlInsertQuery() {
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

    // 11-1. getSqlInsertQuery()만 이용하여 sql문을 작성하면 한 줄의 데이터마다 새로운 insert문을 생성함
    // 👉 나중에 workbench에 파일을 넣어데이터를 생성하였을 때 속도가 매우 느림
    // 이를 위해 insert문을 한번에 만들기 위한 메서드를 생성 👉 다시 Main으로 이동
    public String getTupleString() {
        String tuple = String.format("\n(\"%s\",\n" +
                        "\"%s\",\n" +
                        "\"%s\",\n" +
                        "\"%s\",\n" +
                        "%d,\n" +
                        "\"%s\",\n" +
                        "\"%s\")", this.id, this.address, this.district, this.category, this.emergencyRoom, this.name, this.subdivision);

        return tuple;
    }
}
