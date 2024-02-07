-- Demande 1 :
SELECT * from style_matiere_premiere where id_style = ?1;

----------------------------------------------------------------

create or replace view v_meuble_matiere_premiere as
SELECT c.id_composition, s.id_style_meuble, s.id_matiere_premiere, c.id_categorie, c.quantite, c.id_taille, m.prix_unitaire
FROM style_matiere_premiere s
JOIN composition c on s.id_style_matiere_premiere = c.id_style_matiere_premiere
JOIN matiere_premiere m on m.id_matiere_premiere = s.id_matiere_premiere;

--Demandde 2 :
SELECT * from v_meuble_matiere_premiere where id_matiere_premiere = ?1;

-----------------------------------------------------------------

-- Demande 3 :
SELECT * from v_meuble_prix_confection where sum between ?1 and ?2

create or replace view v_meuble_prix_confection as
select id_categorie, id_taille, id_style_meuble,sum(prix_unitaire * quantite)
    from v_meuble_matiere_premiere group by id_style_meuble,id_categorie, id_taille;

-------------------------------------------------------------------

--Demande 4:
create or replace view v_meuble_benefice_confection_mp as
select *, prix_vente-(temps_confection_main_oeuvre+revient_matiere_premiere_total) as benefice
    from v_temps_confection_par_meuble;

create or replace view v_temps_confection_par_meuble as
select
    extract(hour from tc.temps_confection)+extract(minute from tc.temps_confection)/60.0 as temps_confection,
    om.id_meuble, sum(opg.salaire)*(extract(hour from tc.temps_confection)+extract(minute from tc.temps_confection)/60.0)
    as temps_confection_main_oeuvre, 
    vmpc.sum as revient_matiere_premiere_total, 
    m.prix as prix_vente,

from temps_confection tc join ouvrier_meuble om on tc.id_meuble=om.id_meuble
join v_ouvrier_poste_grade opg on om.id_ouvrier=opg.id_ouvrier
join meuble m on om.id_meuble=m.id_meuble
join v_meuble_prix_confection vmpc on vmpc.id_categorie=m.id_categorie and vmpc.id_style_meuble=m.id_style
group by om.id_meuble, tc.temps_confection, vmpc.sum, m.prix;

-------------------------------------------------------------------

--Demande 5:
select * from v_ouvrier_poste_grade;

create or replace view v_ouvrier_poste_grade as
    SELECT o.id_ouvrier, (current_date - date_embauche)/365 anciennete, p.salaire*pr.valeur as salaire, pr.designation, date_embauche
    FROM ouvrier o
    JOIN poste p on o.id_poste = p.id_poste
    JOIN promotion pr ON (current_date - date_embauche)/365 BETWEEN pr.debut AND pr.fin;