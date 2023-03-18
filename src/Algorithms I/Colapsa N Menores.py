def colapsa_n_menores(N, nums):

    soma, count, index = 0, 0, 0

    while True:
        if count == N: break
        for i in range(len(nums)):
            if i == 0:
                menor = nums[i]
                index = i

            else:
                if nums[i] < menor:
                    menor = nums[i]
                    index = i

        soma += nums.pop(index)   
        count += 1

    return nums.append(soma)
