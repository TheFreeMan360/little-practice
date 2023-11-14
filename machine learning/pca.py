import numpy as np
import matplotlib.pyplot as plt
from sklearn.decomposition import PCA as pca


def draw_matrix(matrix, figure_name):
    plt.scatter(matrix[0], matrix[1], color='r', marker='o')
    plt.xlabel('x')
    plt.ylabel('y')
    plt.title(figure_name, fontsize=20)
    plt.show()


def subtract_mean(matrix):
    for i, row in enumerate(matrix):
        mean = sum(row) / len(row)
        for j, e in enumerate(row):
            matrix[i][j] = e - mean
    return matrix


def record_mean(matrix):
    tmp = []
    for row in matrix:
        tmp.append(sum(row) / len(row))
    return tmp


def swap_by_index(metrix, index):
    tmp = [[] for i in range(len(metrix))]
    for i in index:
        for j, row in enumerate(np.asarray(metrix)):
            tmp[j].append(row[i])
    return np.mat(tmp).T


def percentage(eig_vals, percentage=0.99):
    sorted_array = np.sort(eig_vals)[::-1]
    array_sum = sum(sorted_array)
    tmp_sum = 0
    num = 0
    for i in sorted_array:
        tmp_sum += i
        num += 1
        if tmp_sum >= array_sum * percentage:
            return num


def PCA(data_matrix):
    mean_values = record_mean(data_matrix)  # 把平均值紀錄下來以還原資料
    zeromean_matrix = subtract_mean(data_matrix)
    print(f"subtracted mean matrix:\n{zeromean_matrix.T}\n"+'-'*75)

    covariance_matrix = np.cov(np.array(zeromean_matrix).T, rowvar=0)
    print(f"covariance matrix:\n{covariance_matrix}\n"+'-'*75)

    eignvalues, eignvectors = np.linalg.eig(np.mat(covariance_matrix))
    print(f"eignvalues:\n{eignvalues}\neignvectors:\n{eignvectors}\n"+'-'*75)

    # np.argsort 回傳若小到大排序過後的位置
    if_sorted_index = np.argsort(eignvalues)[::-1]
    eignvalues = sorted(eignvalues, reverse=True)
    eignvectors = swap_by_index(eignvectors, if_sorted_index)
    print(
        f"sorted eignvalues:\n{eignvalues}\nsorted eignvectors:\n{eignvectors}\n"+'-'*75)

    ratio = 0.99
    n = percentage(eignvalues, ratio)  # 篩選要前N個特徵向量 預設0.99
    reduced_metrix = np.array(zeromean_matrix).T * eignvectors[:n].T
    print(
        f"reduced metrix, {ratio*100}% => {n} component:\n{reduced_metrix}\n"+'-'*75)

    reduced_data = reduced_metrix + np.array(mean_values)
    print(
        f"reduced data, {ratio*100}% => {n} component:\n{reduced_data}\n"+'-'*75)

    return reduced_data


if __name__ == "__main__":
    # 原始資料為行，這裡先用列輸入視需要轉置
    original_data = np.array([
        [2.5, 0.5, 2.2, 1.9, 3.1, 2.3, 2, 1, 1.5, 1.1],
        [2.4, 0.7, 2.9, 2.2, 3.0, 2.7, 1.6, 1.1, 1.6, 0.9]])

    draw_matrix(original_data, "scatter of original data ")
    output = PCA(original_data)
    draw_matrix(np.asarray(output).T, "after pca")

    # p = pca(n_components=2)
    # p.fit(original_data.T)
    # print("sklearn.decomposition.PCA")
    # print("eignvalues = " + str(p.explained_variance_))
    # output = p.transform(original_data.T)
    # print("reduced metrix:\n" + str(p.transform(original_data.T)))
    # draw_matrix(output.T, "after pca")
