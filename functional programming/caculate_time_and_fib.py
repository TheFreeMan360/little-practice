from time import time


def caculate_time(func):
    def new_func(n):
        start = time()
        res = func(n)
        end = time()
        print(f"{func.__name__} cost {end - start} time")
        return res
    return new_func


def memo(func):
    cache = dict()

    def new_func(n):
        if n in cache.keys():
            return cache[n]
        res = func(n)
        cache[n] = res
        return res
    return new_func


@caculate_time
def fib(n):
    return fib_helper(n)


@memo
def fib_helper(n):
    return (n if n <= 1 else
            fib_helper(n - 1) + fib_helper(n - 2))


print(fib(100))

# 裝飾器不能放在要遞迴的 function 上
