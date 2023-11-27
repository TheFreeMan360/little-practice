import pandas as pd

def createBonusColumn(employees: pd.DataFrame) -> pd.DataFrame:
    bonus = employees["salary"].apply(lambda x:x*2)
    employees.insert(employees.shape[1], "bonus", bonus)  
    return employees