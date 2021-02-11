
		<!--  colocar um calendario na pagina e seleciona o dia atual -->

  <%@ attribute name="id" required="true" %>

  <input type="text" id="${id}" name="${id}" />
  <script>
    $("#${id}").datepicker({dateFormat: 'dd/mm/yy'});

  </script>