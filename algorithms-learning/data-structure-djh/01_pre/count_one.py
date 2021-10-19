def count_ones(num: int):
    count = 0
    while (0 < num):
        count += 1 & num
        num >>= 1
    return count


n = 13
count = count_ones(n)
print(count)
