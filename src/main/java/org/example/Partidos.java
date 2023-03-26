package org.example;

public class Partidos {

    private String Equipo1;
    private String Equipo2;
    private String golesEquipo1;
    private String golesEquipo2;

    public Partidos(String Equipo1, String Equipo2, String golesEquipo1, String golesEquipo2){
        this.Equipo1 = Equipo1;
        this.Equipo2 = Equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }
    //Getters y setters
    public String getEquipo1() {
        return Equipo1;
    }

    public void setEquipo1(String equipo1) {
        Equipo1 = equipo1;
    }

    public String getEquipo2() {
        return Equipo2;
    }

    public void setEquipo2(String equipo2) {
        Equipo2 = equipo2;
    }

    public String getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(String golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public String getGolesEquipo2() {
        return golesEquipo2;
    }

    public void setGolesEquipo2(String golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }
}
