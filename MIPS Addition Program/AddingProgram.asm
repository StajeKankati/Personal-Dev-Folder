#Staje Kankati
#Lab 2
#Program to add two integers

.data
n1: .asciiz "Enter the first number:\n"
n2: .asciiz "Enter the second number:\n"
n3: .asciiz "\n"
n4: .asciiz "The sum of both numbers is: "

.text
main:
	#Code Reading the first integer
	la $a0,n1
	li $v0,4
	syscall
	li $v0,5
	syscall
	move $s0,$v0
	
	#Code Reading the second integer
	la $a0,n2
	li $v0,4
	syscall
	li $v0,5
	syscall
	move $s1,$v0
	
	#Code Printing a blank line
	la $a0,n3
	li $v0,4
	syscall
	
	#Code to Print Label for the answer
	la $a0,n4
	li $v0,4
	syscall

	#Calculating code
	add $a0,$s1,$s0
	li $v0,1
	syscall	

	#Code to Print blank line
	la $a0,n3
	li $v0,4
	syscall
	li $v0,10
	syscall #exit