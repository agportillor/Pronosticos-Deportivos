package org.example;

public class Pronosticos {

    private String Partido;
    private String Equipo;
    private String resultadoEnum;

    public Pronosticos(String Partido, String Equipo, String resultadoEnum){
        this.Partido = Partido;
        this.Equipo = Equipo;
        this.resultadoEnum = resultadoEnum;
    }

    public int puntos() {
        if (resultadoEnum.equals("GANADOR")) {
            return 1;
        } else if (resultadoEnum.equals("EMPATE")) {
            return 1;
        } else {
            return 0;
        }
    }

    //Getters y setters
    public String getResultadoEnum() {
        return resultadoEnum;
    }

    public void setResultadoEnum(String resultadoEnum) {
        this.resultadoEnum = resultadoEnum;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String equipo) {
        Equipo = equipo;
    }

    public String getPartido() {
        return Partido;
    }

    public void setPartido(String partido) {
        Partido = partido;
    }
}
