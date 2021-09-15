#! /usr/bin/python3


def max(a, b, c):
    maximum = a
    if b > maximum: maximum = b
    if c > maximum: maximum = c
    return maximum


print(f'max(1, 2, 3) = {max(1, 2, 3)}')
