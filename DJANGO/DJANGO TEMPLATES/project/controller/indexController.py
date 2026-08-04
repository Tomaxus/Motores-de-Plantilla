from django.shortcuts import render


def home(request):
	sobre_mi = [
		'Soy apasionado por Linux, los sistemas operativos y la seguridad.',
		'También soy aprendiz en el desarrollo web.',
		'Tengo muchas ganas de aprender y mejorar cada día.',
	]
	intereses = ['Programación', 'Linux', 'Aprender nuevas tecnologías']
	objetivos = [
		'Mejorar mis habilidades en desarrollo web.',
		'Construir páginas modernas y funcionales.',
	]

	context = {
		'nombre': 'TOMAS',
		'sobre_mi': sobre_mi,
		'intereses': intereses,
		'objetivos': objetivos,
	}
	return render(request, 'index.html', context)
