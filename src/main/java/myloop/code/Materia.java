package myloop.code;

import java.time.LocalDate;

public class Materia {
    
    LocalDate date[];  //Data completta
    int DayOfYear[];  //Giorni del anno da 1 a 365/366
    int dateNr;  //Contatori, tracciano nr. date inserite
    
    public Materia() {
    }
    
    public void addDate(LocalDate lD) {
        if(dateNr < 3) {
            date[dateNr] = lD;
            DayOfYear[dateNr++] = lD.getDayOfYear();
        }
    }
    
    public LocalDate getDate(int i) {
        if(i < 3)
            return date[i];
        else return null;
    }
    
    //Questa funzione ritorna la data oppure -1 in caso di "errore"
    public int getDayOfYear(int i) {
        if(i < 3)
            return DayOfYear[i];
        return -1;
    }
    
    public int getNrOfDates() {
        return dateNr;
    }
}
