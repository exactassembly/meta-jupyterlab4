
SUMMARY = "Patch asyncio to allow nested event loops"
HOMEPAGE = "https://github.com/erdewit/nest_asyncio"
AUTHOR = "Ewald R. de Wit <ewald.de.wit@gmail.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=767eeb0122cccaf224035860df064532"

SRC_URI[sha256sum] = "6a80f7b98f24d9083ed24608977c09dd608d83f91cccc24c9d2cba6d10e01c10"

PYPI_PACKAGE = "nest_asyncio"

inherit pypi python_hatchling

RDEPENDS_${PN} = "\
"

BBCLASSEXTEND = "native nativesdk"
