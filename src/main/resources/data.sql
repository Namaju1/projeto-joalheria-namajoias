INSERT IGNORE INTO tb_tipousuario (id_tipo_usuario, nome_usuario) VALUES 
(1, 'Admin'),
(2, 'Cliente'),
(3, 'Vendedor'),
(4, 'Gerente');

INSERT IGNORE INTO tb_categoriaproduto (id_categoria_usuario, nome, descricao) VALUES
(1, 'Anéis', 'Acesório para os dedos'),
(2, 'Colares', 'Acesório para o pescoço'),
(3, 'Brincos', 'Acesório para as orelhas'),
(4, 'Pulseiras', 'Acessorio para os braços'),
(5, 'Relógios', 'Acesório para não atrasar no SENAI');

INSERT IGNORE INTO tb_tipoproduto(id_tipo_produto, descricao, nome) VALUES
(1, 'Joia confeccionada em prata 925, conhecida por sua durabilidade e brilho elegante.', 'Prata'),
(2, 'Joia feita em ouro 18K, símbolo de luxo e tradição com alto valor de mercado.', 'Ouro'),
(3, 'Joia em platina, metal nobre extremamente resistente, raro e de brilho sofisticado.', 'Platina'),
(4, 'Outra Joia','Outro');


INSERT IGNORE INTO tb_produto (id_produto, nome_produto, descricao, preco, tipo_produto, img_url) VALUES
(1, 'Anel de coração', 'Anel de ouro com pingente de coração', 1299.99, 1, 'http://localhost:8080/imagens/anelderubi.webp'),
(2, 'Anel de diamante', 'Anel de diamante cor prata', 2989.99, 2, 'http://localhost:8080/imagens/aneldiamante.webp'),
(3, 'Anel de zicornia azul', 'Anel magnifico de zicornia azul', 4990.90, 3, 'http://localhost:8080/imagens/anelzirconiaazul.webp'),
(4, 'Colar de esmeralda', 'Colar chocker de esmeralda', 8799.00, 2, 'http://localhost:8080/imagens/colaresmeralda.webp'),
(5, 'Colar de diamante', 'Colar de diamante prata', 8899.90, 1, 'http://localhost:8080/imagens/colardiamantes.webp'),
(6, 'Colar de citrina', 'Colar de citrina escuro', 11199.50, 2, 'http://localhost:8080/imagens/colaramarelo.webp'),
(7, 'Brincos de ouro', 'Brincos de ouro branco', 3500.00, 3, 'http://localhost:8080/imagens/brincoouros.webp'),
(8, 'Brinco pedras coloridas', 'Brincos de ouro de pedras coloridas', 1349.99, 1, 'http://localhost:8080/imagens/brincocolorido.webp'),
(9, 'Brinco de topázio', 'Pares de brincos de topázio puro', 2459.99, 2, 'http://localhost:8080/imagens/brincoamarelinho.webp'),
(10, 'Relógio Digital', 'Relógio com pulseira de silicone', 120.00, 3, 'relogio2.jpg'),
(11, 'Anel Vintage', 'Anel bijuteria com pedras coloridas', 39.90, 3, 'anel3.jpg'),
(12, 'Colar Cruz', 'Colar de platina com cruz simples', 699.00, 1, 'colar3.jpg'),
(13, 'Brinco Estrela', 'Brinco de prata com estrelas pequenas', 79.00, 2, 'brinco3.jpg'),
(14, 'Pulseira Trançada', 'Pulseira de couro com fecho magnético', 110.00, 3, 'pulseira3.jpg'),
(15, 'Relógio de Bolso', 'Relógio clássico de bolso em ouro', 1399.99, 1, 'relogio3.jpg'),
(16, 'Anel Duplo', 'Anel de dois aros interligados', 229.00, 2, 'anel4.jpg'),
(17, 'Colar Pedra Azul', 'Colar com pedra azul safira sintética', 275.00, 3, 'colar4.jpg'),
(18, 'Brinco Luxo', 'Brinco de platina com pedras brilhantes', 1200.00, 2, 'brinco4.jpg'),
(19, 'Pulseira Infantil', 'Pulseira leve de bijuteria para crianças', 25.00, 3, 'pulseira4.jpg'),
(20, 'Relógio Executivo', 'Relógio de prata com cronômetro', 650.00, 2, 'relogio4.jpg');

INSERT IGNORE INTO tb_endereco (id_endereco, cep, rua, numero, bairro, cidade, uf, complemento) VALUES
(1, 18015140,'Ramon Haro Martini',150, 'Vila Haro', 'Sorocaba', 'SP', 'TESTE'),
(2, 18060110,'Escolástica Rosa de Almeida',180, 'Vila Carvalho', 'Sorocaba', 'SP', 'teste2'),
(3, 18078000,'Gregório Ramos dos Santos',190, 'Jardim Santa Cecília', 'Sorocaba', 'SP', 'TESTE3'),
(4, 18078110,'Victor Alfarano',200, 'Jardim Santa Camilo', 'Sorocaba', 'SP', 'TESTE4'),
(5, 18020110,'Largo Francisco Eufrásio',210, 'Vila Hortencia', 'Sorocaba', 'SP', 'TESTE5');


INSERT IGNORE INTO tb_usuario (id_usuario, nome_usuario, senha, cpf, email, telefone, data_nascimento, endereco_id_endereco, tipo_usuario) VALUES
(1, 'Mariana Alves', 'mari123', '66985214578', 'mari@gmail.com', '15332458796', '2005-05-20', 1, 2),
(2, 'Juliano Souza', 'juli123', '22657845210', 'juli@gmail.com', '15885214587', '2008-08-21', 2, 2),
(3, 'Nathália Venega', 'nat123', '44587520012', 'nat@gmail.com', '15996589742', '2008-01-21', 3, 2),
(4, 'Guilherme Jacob', 'gui123', '33697845210', 'gui@gmail.com', '15887542102', '2007-12-11', 4, 2),
(5, 'Vedilson Silva', 'ved123', '33687521045', 'ved@gmail.com', '15662598754', '1985-07-10', 5, 2);

INSERT IGNORE INTO tb_ornamentos (id_ornamentos, descricao, nome) VALUES
(1, 'Pedra preciosa de alto valor, conhecida por sua dureza e brilho incomparável.', 'Diamante'),
(2, 'Cristal sintético com aparência semelhante ao diamante, muito utilizado em joias acessíveis.', 'Zircônia'),
(3, 'Pedra semipreciosa de cor verde intensa, símbolo de renovação e prosperidade.', 'Esmeralda'),
(4, 'Gema preciosa vermelha, símbolo de paixão e energia.', 'Rubi'),
(5, 'Pedra azul profunda, associada à sabedoria e à nobreza.', 'Safira');
