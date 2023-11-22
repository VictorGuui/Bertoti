import pandas as pd
from pandasai import PandasAI
from pandasai.llm.starcoder import Starcoder

llm = Starcoder(api_token="")


df = pd.read_csv("https://raw.githubusercontent.com/inteligentni/Class-05-Feature-engineering/master/The%20Beatles%20songs%20dataset%2C%20v1%2C%20no%20NAs.csv")

pandas_ai = PandasAI(llm, conversational=False)

res = pandas_ai.run(df, prompt='what songs belong to abbey road album')

res['Title'].to_string(index=False)


