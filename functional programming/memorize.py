def memo(func):
    cache = dict()

    def new_func(n):
        if n in cache.keys():
            return cache[n]
        res = func(n)
        cache[n] = res
        return res
    return new_func
