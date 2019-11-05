/* 
 * Copyright 2019 Alejandro Alberca - alejandro.alberca.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Scanner;

/**
 *
 * @author Alejandro Alberca - alejandro.alberca.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN = new Scanner(System.in, "ISO-8859-1");

    public static void main(String[] args) {
        boolean semaforo = false;
        System.out.print("Introduce un numero que este aprobado: ");
        do {
            try {
                double  nota = SCN.nextDouble();
                if (nota >= 5 && nota <=10) {
                    semaforo = false;
                    System.out.println("El alumno ha APROBADO con ...: ");

                }else {semaforo = true;
                    System.out.println("Has introducido un valor que no es un aprobado.");}

            } catch (Exception e) {
                semaforo = true;
                System.out.println("Error");
            }
            finally {SCN.nextLine();}

        } while (semaforo);

    }
}
