/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sync;

import entities.Cristal;
import entities.User;

/**
 *
 * @author sdx
 */
public interface SyncBd {
     public boolean add(Object object);
     public User getUser(String username);
     public Cristal getCristal(String name);
}
