#! /usr/bin/python3

print("３つの値の最大値を求める。")

a = int(input('整数aの値：'))
b = int(input('整数bの値：'))
c = int(input('整数cの値：'))

maximum = a
if b > maximum: maximum = b
if c > maximum: maximum = c

print(f'最大値は{maximum}です。')
