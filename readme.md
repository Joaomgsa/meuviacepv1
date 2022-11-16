# Meu CEP API

Uma API em Java e Spring Framework para consulta de cep.


## Como a Api deve funcionar?

<p>Nossa api deve responder as informações de um cep(código de enderecamento postal)</p>

<p> A API terá os seguintes endpoints</p>

<code>GET/enderecos: consulta um endereco.</code>

<p>Deve retornar as informações do endereço</p>

<code>
{
"cep": "01001-000",
"logradouro": "Praça da Sé",
"complemento": "lado ímpar",
"bairro": "Sé",
"localidade": "São Paulo",
"uf": "SP",
"ibge": "3550308",
"gia": "1004",
"ddd": "11",
"siafi": "7107"
}

A resposta deve conter os seguintes códigos

<ul>
    <li>200 - Caso o endereco seja encontrado</li> 
    <li>404 - Caso o endereco não seja encontrado</li>
</ul>
</code>

Por default, a API está disponível no endereço
http://localhost:8080/
