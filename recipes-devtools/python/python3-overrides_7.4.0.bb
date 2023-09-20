
SUMMARY = "A decorator to automatically detect mismatch when overriding a method."
HOMEPAGE = "https://github.com/mkorpela/overrides"
AUTHOR = "Mikko Korpela <mikko.korpela@gmail.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fa818a259cbed7ce8bc2a22d35a464fc"

SRC_URI[sha256sum] = "9502a3cca51f4fac40b5feca985b6703a5c1f6ad815588a7ca9e285b9dca6757"

PYPI_PACKAGE = "overrides"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = "\
"

BBCLASSEXTEND = "native nativesdk"
