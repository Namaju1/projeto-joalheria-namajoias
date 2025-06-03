INSERT IGNORE INTO tb_tipousuario (id_tipo_usuario, nome_usuario) VALUES 
(1, 'Adimin'),
(2, 'Cliente'),
(3, 'Vendedor'),
(4, 'Gerente');

INSERT IGNORE INTO tb_categoriaproduto (id_categoria_usuario, nome, descricao) VALUES
(1, 'Anéis', 'Acesório para os dedos'),
(2, 'Colares', 'Acesório para o pescoço'),
(3, 'Brincos', 'Acesório para as orelhas'),
(4, 'Pulseiras', 'Acessorio para os braços'),
(5, 'Relógios', 'Acesório para não atrasar no SENAI');

INSERT IGNORE INTO tb_produto (id_produto, nome_produto, descricao, preco, tipo_produto, img_url) VALUES
(1, 'Anel Solitário', 'Anel de ouro com diamante', 1299.99, 1, 'anel1.jpg'),
(2, 'Colar Coração', 'Colar de prata com pingente de coração', 299.99, 2, 'colar1.jpg'),
(3, 'Brinco Pérola', 'Brinco de bijuteria com pérola sintética', 49.90, 3, 'brinco1.jpg'),
(4, 'Pulseira Blue Shine', 'Pulseira de platina com detalhes azuis', 799.00, 4, 'pulseira1.jpg'),
(5, 'Relógio Clássico', 'Relógio dourado estilo clássico', 899.90, 1, 'relogio1.jpg'),
(6, 'Anel Moderno', 'Anel prateado com design moderno', 199.50, 2, 'anel2.jpg'),
(7, 'Colar Choker', 'Choker de bijuteria com strass', 35.00, 3, 'colar2.jpg'),
(8, 'Brinco Argola Média', 'Brinco de ouro em formato de argola', 349.99, 1, 'brinco2.jpg'),
(9, 'Pulseira Pandora', 'Pulseira de prata com berloques', 459.99, 2, 'pulseira2.jpg'),
(10, 'Relógio Digital', 'Relógio com pulseira de silicone', 120.00, 3, 'relogio2.jpg'),
(11, 'Anel Vintage', 'Anel bijuteria com pedras coloridas', 39.90, 3, 'anel3.jpg'),
(12, 'Colar Cruz', 'Colar de platina com cruz simples', 699.00, 4, 'colar3.jpg'),
(13, 'Brinco Estrela', 'Brinco de prata com estrelas pequenas', 79.00, 2, 'brinco3.jpg'),
(14, 'Pulseira Trançada', 'Pulseira de couro com fecho magnético', 110.00, 3, 'pulseira3.jpg'),
(15, 'Relógio de Bolso', 'Relógio clássico de bolso em ouro', 1399.99, 1, 'relogio3.jpg'),
(16, 'Anel Duplo', 'Anel de dois aros interligados', 229.00, 2, 'anel4.jpg'),
(17, 'Colar Pedra Azul', 'Colar com pedra azul safira sintética', 275.00, 3, 'colar4.jpg'),
(18, 'Brinco Luxo', 'Brinco de platina com pedras brilhantes', 1200.00, 4, 'brinco4.jpg'),
(19, 'Pulseira Infantil', 'Pulseira leve de bijuteria para crianças', 25.00, 3, 'pulseira4.jpg'),
(20, 'Relógio Executivo', 'Relógio de prata com cronômetro', 650.00, 2, 'relogio4.jpg');
