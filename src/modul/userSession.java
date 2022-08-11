/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul;

import page.loginPage;

/**
 *
 * @author Budi Utomo
 */
public class userSession {

    private static String userLevel;

    public static String getUserLevel() {
        return userLevel;
    }

    public static void setUserLevel(String userLevel) {
        userSession.userLevel = userLevel;
    }
}
