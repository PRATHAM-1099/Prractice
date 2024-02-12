package DesignPatterns.TemplateMethod;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding milk and sugar");
    }

    @Override
    boolean hook(){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            String ans = in.readLine();
            return ans.toLowerCase().startsWith("y");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
