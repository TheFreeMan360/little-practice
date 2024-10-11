dimensions = 2
index_values = [4, 3, ]
dimension_sizes = [4, 5,]

ans = index_values[-1]
for i in range(dimensions - 1):
    mul = 1
    for d in range(i, dimensions - 1): mul *= dimension_sizes[d]
    ans += index_values[i] * mul
    
print(ans)