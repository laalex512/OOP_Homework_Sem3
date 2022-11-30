// Создать package – data. Работу продолжаем в нем

// 1. Реализовать абстрактный класс User и его наследники Student и Teacher.
// Родитель имеет в себе общие данные (пример: фио, год рождения и тд),
// а наследники собственные параметры (какие, по выбору преподавателя –
// Пример: studentId для Student, disciplesTaught для Teacher).
// 2. После этого проговорить со студентами важность снижения дублирования кода
// и легкость управления структурой данных
// (в том числе, создание необходимого числа корректных конструкторов)
// и добавления новых сущностей путем наследования от абстрактного класса

package Homework3.Users;

public abstract class User {
	protected String name;
	protected String birthday;

	public String getName() {
		return this.name;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return this.getName() + " " + this.getBirthday();
	}
}
