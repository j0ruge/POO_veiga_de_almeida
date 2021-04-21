/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import com.sun.org.apache.xml.internal.security.utils.XMLUtils;
import java.util.Scanner;
import sun.security.krb5.internal.rcache.AuthList;
import sun.security.util.AbstractAlgorithmConstraints;

/**
 *
 * @author JorUge
 */
public class RuleOfThree {
    
    double x1, x2, y1, unknown;

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setUnknown(double unknown) {
        this.unknown = unknown;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getY1() {
        return y1;
    }

    public double getUnknown() {
        return unknown;
    }    
    
    public void inputData() {
    Scanner input = new Scanner(System.in);
        System.out.println("1a Grandeza Proporcional    : ");
        setX1(Double.parseDouble(input.nextLine()));
        
        System.out.println("2a Grandeza Proporcional    : ");
        setX2(Double.parseDouble(input.nextLine()));        
        
        System.out.println("Valor de Referência         : ");
        setY1(Double.parseDouble(input.nextLine()));        
    
        
    }
    
    
    public double RuleOfThree(double x1, double x2, double y1 ) {
        
        setX1(x1);
        setX2(x2);
        setY1(y1);
        
        setUnknown( (getY1() * getX2() ) / getX1() );
    return  getUnknown();
        
    };
    
    
    
}
