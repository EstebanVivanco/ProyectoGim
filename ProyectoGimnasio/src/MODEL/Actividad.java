/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author Esteban V
 */
public class Actividad {
    
    String Nombre ,Descripción;
    int id, Equipacion_ID, Entrenador_ID, TipoActividad_ID, CantidadAsistentes;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String Descripción) {
        this.Descripción = Descripción;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEquipacion_ID() {
        return Equipacion_ID;
    }

    public void setEquipacion_ID(int Equipacion_ID) {
        this.Equipacion_ID = Equipacion_ID;
    }

    public int getEntrenador_ID() {
        return Entrenador_ID;
    }

    public void setEntrenador_ID(int Entrenador_ID) {
        this.Entrenador_ID = Entrenador_ID;
    }

    public int getTipoActividad_ID() {
        return TipoActividad_ID;
    }

    public void setTipoActividad_ID(int TipoActividad_ID) {
        this.TipoActividad_ID = TipoActividad_ID;
    }

    public int getCantidadAsistentes() {
        return CantidadAsistentes;
    }

    public void setCantidadAsistentes(int CantidadAsistentes) {
        this.CantidadAsistentes = CantidadAsistentes;
    }
    
    
}
