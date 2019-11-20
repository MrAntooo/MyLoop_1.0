package myloop.code;

import java.time.LocalDate;
import java.util.HashMap;

public final class It {
   
    HashMap<String, Materia> HashMate;
    LocalDate locDate;
    
    public It() {
        HashMate = new HashMap<String, Materia>();
    }
    
    public void addMateria(String nomeMat, Materia mate) {
        HashMate.put(nomeMat, mate);
    }
    
}
