package com.TestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

			
public class Redwood extends Tree {
 public static void main(String[] args) {
 new Redwood().go();
 }void go() {
 go2(new Tree(), new Redwood());
 go2((Redwood) new Tree(), new Redwood());
 }
 void go2(Tree t1, Redwood r1) {
 Redwood r2 = (Redwood)t1;
 Tree t2 = (Tree)r1;
 } }
 class Tree { }