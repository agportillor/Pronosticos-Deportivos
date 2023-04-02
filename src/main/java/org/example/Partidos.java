package org.example;

public class Partidos {

    private String Equipo1;
    private String Equipo2;
    private int golesEquipo1;
    private int golesEquipo2;

    public Partidos(String Equipo1, String Equipo2, int golesEquipo1, int golesEquipo2){
        this.Equipo1 = Equipo1;
        this.Equipo2 = Equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }

    // Define quien gano.
    public resultadoEnum resultado(Equipo equipo) {
        if (equipo.equals(Equipo1)) {
            if (golesEquipo1 > golesEquipo2) {
                return resultadoEnum.GANADOR;
            } else if (golesEquipo1 < golesEquipo2) {
                return resultadoEnum.PERDEDOR;
            } else {
                return resultadoEnum.EMPATE;
            }
        } else if (equipo.equals(Equipo2)) {
            if (golesEquipo2 > golesEquipo1) {
                return resultadoEnum.GANADOR;
            } else if (golesEquipo2 < golesEquipo1) {
                return resultadoEnum.PERDEDOR;
            } else {
                return resultadoEnum.EMPATE;
            }
        } else {
            return null;
        }
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

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }
}
