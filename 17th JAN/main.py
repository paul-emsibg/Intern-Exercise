import json
from bs4 import BeautifulSoup

def parssing(content):
    soup=BeautifulSoup(content,'html.parser')
    result=[]

    for division in soup.find_all('div',class_='Days'):
        name=division.find('h2').text
        activities=[activity.text for activity in division.find_all('li',class_='activity')]
        result.append({'Day':name,'Activity':activities})
    return {'Activities':result}
    

def main():
    with open('index.html','r',encoding='utf-8') as file:
        content=file.read()

    json_data=parssing(content)

    print("output")
    print(json.dumps(json_data,indent=2))

    with open('result.json','w',encoding='utf-8') as json_file:
        json.dump(json_data,json_file,indent=2)

if __name__=='__main__':
    main()
