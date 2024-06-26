package com.course.selenium.SearchElements;

import net.bytebuddy.utility.RandomString;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;

    public class Helpers {

        public String generateRandomString(){
            RandomString rand = new RandomString(10);
            return rand.nextString();
        }
        //VYGENEROVÁNÍ NÁHODNÉHO EMAILU PRO TESTOVÁNÍ

        public String generateRandomLettersOnly(int length) {
            String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            Random r = new Random();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < length; i++) {
                result.append(characters.charAt(r.nextInt(characters.length())));
            }
            return result.toString();
        }


         /*EXEPTION - TRY/CATCH ODCHYCENÍ VYJÍMEK

         try {
            element = driver.findElement(By.className("alert-success"));
        } catch (Exception e) {
            Assert.fail("Element not found - Newsletter was not submitted ...");
        }
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue("Newsletter was not submitted ...",
                element.getText().contains("Newsletter : You have successfully subscribed to this newsletter."));
    }*/

    }

