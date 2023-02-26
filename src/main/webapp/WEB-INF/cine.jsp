<%@ page pageEncoding="UTF-8"%>
<% String[]aCine=(String[])session.getAttribute("aCine");
%>

<h2><%=aCine[1]%></h2>
<div class="cine-info">
	<div class="cine-info datos">
		<p><%=aCine[4]%> - <%=aCine[6]%></p>
		<p><%=aCine[5]%></p>
		<br />
		<div class="tabla">
		<%String [][] mTarifas=(String[][])session.getAttribute("mTarifas"); 
			boolean bolFila=true;
			for( String[] aTarifa : mTarifas){%>
				<div class=<%= bolFila ? "fila" : "fila impar"  %>>
					<div class="celda-titulo"><%=aTarifa[0]%></div>
					<div class="celda"><%=aTarifa[1]%></div>
				</div>
			<% bolFila = !bolFila;} %>
			
		</div>
		<div class="aviso">
			<p>A partir del 1ro de julio de 2016, Cinestar Multicines
				realizará el cobro de la comisión de S/. 1.00 adicional al tarifario
				vigente, a los usuarios que compren sus entradas por el aplicativo
				de Cine Papaya para Cine Star Comas, Excelsior, Las Américas,
				Benavides, Breña, San Juan, UNI, Aviación, Sur, Porteño, Tumbes y
				Tacna.</p>
		</div>
	</div>
	<img src="img/cine/1.2.jpg" /> <br />
	<br />
	<h4>Los horarios de cada función están sujetos a cambios sin
		previo aviso.</h4>
	<br />
	<div class="cine-info peliculas">
		<div class="tabla">
		
				<div class="fila">
					<div class="celda-cabecera">Películas</div>
					<div class="celda-cabecera">Horarios</div>
				</div>
			<%String [][] mPeliculas=(String[][])session.getAttribute("mPeliculas"); 
			bolFila=false;
			for(String[]aPelicula:mPeliculas){%>
			<div class=<%= bolFila ? "fila" : "fila impar"  %>>
				<div class="celda-titulo"><%=aPelicula[0]%></div>
				<div class="celda"><%=aPelicula[1]%></div>
			</div>
			<% bolFila = !bolFila;} %>
		</div>
	</div>
</div>
<div>
	<img style="float: left;" src="img/cine/<%=aCine[0]%>.3.jpg" /> <span
		class="tx_gris">Precios de los juegos: desde S/1.00 en todos
		los Cine Star.<br /> Horario de atención de juegos es de 12:00 m hasta
		las 10:30 pm. <br />
	<br /> Visitános y diviértete con nosotros. <br />
	<br /> <b>CINESTAR</b>, siempre pensando en tí.
	</span>
</div>
