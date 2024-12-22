import xmltodict
import yaml

with open('scedule.xml', 'r', encoding='utf-8') as xml_file:
    xml_data = xml_file.read()
xml_dict = xmltodict.parse(xml_data)
yaml_data = yaml.dump(xml_dict, default_flow_style=False, allow_unicode=True)

with open('output.yaml', 'w', encoding='utf-8') as yaml_file:
    yaml_file.write(yaml_data)
