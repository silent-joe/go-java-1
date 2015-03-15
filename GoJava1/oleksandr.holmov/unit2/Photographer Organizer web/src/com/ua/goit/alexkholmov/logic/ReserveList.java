/**
 * 
 */
package com.ua.goit.alexkholmov.logic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SASH
 *
 */
public class ReserveList {

    private List<Reserve> reservs = new ArrayList<Reserve>();
    private int studioId;
    
    /**
     * @return the studioId
     */
    public int getStudioId() {
        return studioId;
    }
    /**
     * @param studioId the studioId to set
     */
    public void setStudioId(int studioId) {
        this.studioId = studioId;
    }
    
    public void addReserve(Reserve reserve) {
        reservs.add(reserve);
    }
    
    public void delReserve(Reserve reserve) {
        if (reservs.contains(reserve)) {
            reservs.remove(reserve);
        }
    }
    
    public int getAmountReserves() {
        return reservs.size();
    }
}
