package com.jxareas.composite;

import com.jxareas.composite.model.Menu;
import com.jxareas.composite.model.MenuItem;

public class Main {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main", "/main");

        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims", "/claims");
        mainMenu.add(claimsSubMenu);

        MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personal_claims");

        claimsSubMenu.add(personalClaimsMenu);

        System.out.println(mainMenu);


    }
}
