# Parte 1: Ingeniería Inversa del JAR

## Herramienta utilizada
Para realizar la ingeniería inversa del archivo `introduction-0.0.1-SNAPSHOT.jar`, se utilizaron las siguientes herramientas:

- **Decompilador Online:** javadecompilers.com  
Estas herramientas permitieron analizar el bytecode Java y obtener una representación legible del código fuente.

## ¿Qué clases existen?
Tras analizar la estructura del paquete `umg.edu.gt.data_structure.array` y las importaciones presentes en la clase principal, se identificaron las siguientes clases que conforman la lógica del programa:

- **App**  
  Clase principal (Main) encargada de orquestar la ejecución y prueba de los algoritmos implementados.

- **BubbleSort**  
  Contiene la implementación del algoritmo de ordenamiento Bubble Sort.

- **MergeSortDemo**  
  Implementa el algoritmo de ordenamiento por mezcla (Merge Sort).

- **QuickSort**  
  Contiene la implementación del algoritmo de ordenamiento rápido (Quick Sort).

- **SumArray**  
  Clase utilitaria diseñada para realizar operaciones aritméticas sobre arreglos, específicamente la sumatoria de sus elementos.

## ¿Qué operaciones se realizan sobre los arreglos?

Del análisis del código decompilado de la clase `App.java` se identifican las siguientes operaciones sobre arreglos:

- Inicialización de arreglos con valores predefinidos.
- Recorridos mediante ciclos `for`.
- Uso de la propiedad `.length`.
- Impresión con `Arrays.toString()`.
- Cálculo de la sumatoria mediante la clase `SumArray`.



## ¿Qué algoritmos de ordenamiento se utilizan?

El proyecto implementa y ejecuta los siguientes algoritmos de ordenamiento:
- Bubble Sort
- Merge Sort
- Quick Sort
- Ordenamiento nativo de Java mediante `Arrays.sort()` (Dual-Pivot Quicksort)


### Fragmento 1: Imports

```java
package umg.edu.gt.data_structure.introduction;

import java.util.Arrays;
import umg.edu.gt.data_structure.array.BubbleSort;
import umg.edu.gt.data_structure.array.MergeSortDemo;
import umg.edu.gt.data_structure.array.QuickSort;
import umg.edu.gt.data_structure.array.SumArray;
```

### Fragmento 2: Algoritmos de ordenamiento

```java
BubbleSort blueSort = new BubbleSort();
int[] arr = new int[]{5, 1, 4, 2, 8};
blueSort.bubbleSort(arr);
```

```java
MergeSortDemo mergeSortDemo = new MergeSortDemo();
int[] d2 = new int[]{8, 3, 7, 4, 9, 2};
mergeSortDemo.mergeSort(d2);
```

```java
QuickSort quick = new QuickSort();
int[] arr1 = new int[]{10, 7, 8, 9, 1, 5};
quick.quickSort(arr1, 0, arr1.length - 1);
```

```java
Arrays.sort(arr2);
```

### Fragmento 3: Operaciones sobre arreglos

```java
SumArray sumArray = new SumArray();
System.out.println(sumArray.sum(d1));
```

```java
for(int var9 = 0; var9 < var8; ++var9) {
    n = var7[var9];
    System.out.print(n + " ");
}

