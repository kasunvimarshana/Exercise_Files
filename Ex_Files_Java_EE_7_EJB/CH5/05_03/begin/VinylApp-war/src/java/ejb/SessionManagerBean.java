/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;

import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author ehenr
 */
@Singleton
@LocalBean
@WebListener
public class SessionManagerBean implements HttpSessionListener {
    private static int counter = 0;

    public void sessionCreated(HttpSessionEvent se) {
       counter++;
    }


    public void sessionDestroyed(HttpSessionEvent se) {
       counter--;
    }
    
    public int getActiveSessionsCount() {
        return counter;
    }

}
