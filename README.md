# Complexity Analyzer

> Benjamin BESNIER - RICM4 - Polytech Grenoble


## Introduction

This is the repository which contains my work during my 12 weeks internship at the [G-Scop](http://www.g-scop.grenoble-inp.fr/) laboratory

The purpose of this internship was to be able to claim the complexity of algorithms submitted on [Caseine](http://caseine.org/) by students

The project is divided into two part :
* In the first part, we use the multi-class linear regression with the CPU execution time. The tests are realized on multiple algorithms where their complexity is well known (package sample) 
* In the second part, __TODO__


## First step

The first step is made of 5 packages (for now) :
* __gui__ : Corresponds to the graphic interface used to check the linear regression obtained
* __kernel__ : Contains the kernel of the program, contains the class used to get the linear regression 
* __main__ : Contains the main method
* __samples__ : Contains all the algorithms we want to know the complexity
* __utils__ : Contains settings variable used in the project

In this first step, we firstly run multiple times the several samples wanted (precised in run arguments) and measure their CPU running time. 
Once all the iterations have been done, the algorithm does a multidimensional linear regression in order to compute the complexity class of the current algorithm.
Then, its plot the data obtained from the algorithms running and the linear regression in order to check if they are both in line.

## Second step
